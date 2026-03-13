public class Exemplooperadoresaritimeticos {

    static void main(String[] args) {

        //Declarar uma variavel do tipo int e atribuir um valor

        int x= 12;
        int y= 32;

        x++; //aumentou o x em 1 unidade, e a mesma coisa que x = x + 1;
        System.out.println("X é " + x);
        x--;
        System.out.println("X agora é " + x);

        x +=2; //x=x+2; (Aumentar o x em 2 unidades)
        System.out.println("X é " + x);//14

        x-=10;
        System.out.println("X é " + x   );//4
        x *= 3;
        System.out.println("X é " + x   );//12
        x /= 2;
        System.out.println("X é " + x   );//6
        x %= 2;
        System.out.println("X é " + x   );//0
        y *= x;
        System.out.println("Y é " + y   );//0

    }
}
