package model;

public class Expression implements statement {
    private statement left, right;
    private String op;

    public Expression(statement left, String op, statement right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    public statement getLeft() {
        return left;
    }

    public statement getRight() {
        return right;
    }

    public String getOp() {
        return op;
    }

    @Override
    public String string_val() throws syntaxError {
        return op;
    }
}