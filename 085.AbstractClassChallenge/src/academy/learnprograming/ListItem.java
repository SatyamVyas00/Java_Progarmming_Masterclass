package academy.learnprograming;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem setNext(ListItem toSetNext);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem toSetPrevious);
    abstract int compareTo(ListItem toCompare);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
