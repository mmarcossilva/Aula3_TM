public class Main {
    public static void main(String[] args) {
        Pessoa arr[] = new Pessoa[4];

        arr[0] = new Pessoa("nome",1);
        arr[1] = new Pessoa("nome1",5);
        arr[2] = new Pessoa("nome2",4);
        arr[3] = new Pessoa("nome3",2);

        SortUtil.sort(arr);
        System.out.println(arr);

    }
}
