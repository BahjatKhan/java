package datastructure;

public class SpaceComplexity {
    public static void main(String[] args) {
        Holder holder = new Holder("Hello");
        holder.setNext(new Holder("World"));
        for (Holder h = holder; h != null; h = h.next) {
            System.out.println(h.o);
        }
    }

    static class Holder {
        private Object o;
        private Holder next;

        public Holder(Object o) {
            this.o = o;
        }

        public void setNext(Holder nex) {
            this.next = nex;
        }
    }
}