package academy.learnprograming;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem toSetNext) {
        rightLink = toSetNext;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem toSetPrevious) {
        leftLink = toSetPrevious;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
