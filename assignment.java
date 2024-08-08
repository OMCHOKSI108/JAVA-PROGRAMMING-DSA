//assignment operator use 
class assignment {

    public static void main(String[] args) {
        int A = 10;
        int B = 10;
        int C = 10;
        int D = 10;
        //  A = A + 1;
        A += A;

        System.out.println(A);
        //  B = B - 1;
        B -= B;

        System.out.println(C);
        //  C = C / C;
        C /= C;

        System.out.println(C);
        //  D = D % D ;
        D %= D;

        System.out.println(D);

    }
}
