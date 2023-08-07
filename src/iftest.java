class Iftest {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3)
        {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;   // итерация прерывается
        }
        if (x == 3 ) {
            System.out.print("Do");
        }
    }
}
