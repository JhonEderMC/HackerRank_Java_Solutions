package Advanced.Java_Visitor_Pattern_07;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int sumInLeavesVisitor = 0;

    public int getResult() {
        //implement this
        return this.sumInLeavesVisitor;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        this.sumInLeavesVisitor += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private static final int MOD = 1000000007;
    private int productOfRedNodesVisitor = 1;


    public int getResult() {
        //implement this
        return this.productOfRedNodesVisitor;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getColor() == Color.RED)productOfRedNodesVisitor = (int)(((long)productOfRedNodesVisitor * node.getValue()) % MOD);
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor() == Color.RED)productOfRedNodesVisitor = (int)(((long)productOfRedNodesVisitor * leaf.getValue()) % MOD);
    }
}

class FancyVisitor extends TreeVis {
    private int leafValue = 0;
    private int noLeafValue = 0;
    public int getResult() {
        //implement this
        return Math.abs(this.leafValue - this.noLeafValue);
    }

    public void visitNode(TreeNode node) {
        //implement this
        this.noLeafValue += node.getDepth() %2 == 0 ? node.getValue() : 0;
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        this.leafValue +=  leaf.getColor() == Color.GREEN ? leaf.getValue() : 0;
    }
}

public class Solution {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nodeValues = new int[n];
        Color [] nodeColors = new Color[n];
        List<List<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nodeValues[i] = sc.nextInt();
            arrayList.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            nodeColors[i] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        Tree[] treeNodes = new Tree[n];
        treeNodes[0] = new TreeNode(nodeValues[0], nodeColors[0], 0);
        Queue<Integer> parentQueue = new LinkedList<>();
        parentQueue.add(0);
        boolean[] visitedList = new boolean[n];
        visitedList[0] = true;

        for(int i=0; i<n-1; i++){
            int u = sc.nextInt()-1;
            int v = sc.nextInt()-1;
            arrayList.get(u).add(v);
            arrayList.get(v).add(u);
        }

        while(!parentQueue.isEmpty()) {
            int parentIndex = parentQueue.poll();//parent is the node with no children
            Tree parentTree = treeNodes[parentIndex];//parentTree is the node with no children
            for(int childIndex : arrayList.get(parentIndex)){
                if(!visitedList[childIndex]){
                    Tree child;
                    if(arrayList.get(childIndex).size() == 1){
                        child = new TreeLeaf(nodeValues[childIndex], nodeColors[childIndex], parentTree.getDepth()+1);
                    }else{
                        child = new TreeNode(nodeValues[childIndex], nodeColors[childIndex], parentTree.getDepth()+1);
                    }
                    treeNodes[childIndex] = child;
                    parentQueue.add(childIndex);
                    visitedList[childIndex] = true;
                    ((TreeNode) parentTree).addChild(child);
                }
            }
        }
        return treeNodes[0];
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}