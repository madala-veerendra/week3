public class L17C1 {
    public static void main(String[] args){
        LinkedList myll = new LinkedList();
        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
        System.out.println(myll.get(1));
        myll.addLast("Gamora");
        myll.addFirst("AntMan");
        myll.add(2, "Natasha");
        Iterator it = myll.iterator();
        while(it.hasNext()){
            //it.remove();
            System.out.println(it.next());
        }
        System.out.println("whos at the top"+myll.peek());
        System.out.println("hey first one get out"+myll.poll());
        System.out.println("whos their standing at the last:"+myll.pop());
        Iterator it1 = myll.iterator();
        while(it1.hasNext()){
            //it.remove();
            System.out.println(it1.next());
        }
    }
}
