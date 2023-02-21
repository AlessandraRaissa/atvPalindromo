package atv2;
import javax.swing.JOptionPane;

public class revisaoaula2{

    public static void main(String[] args){

        String r="";
        String f=JOptionPane.showInputDialog(null,"Digite uma frase: ","");
        String f1=f.replaceAll("\\s+",""); //substitui os espaços 
        String f2= new StringBuilder(f1).reverse().toString(); //pega o f1 e inverte para a string f2
        if(f1.equals(f2)){
            r="É um palindromo";
        }else{
            r="Não é um palindromo";
        }
        JOptionPane.showInputDialog(null,r,"Resultado: ",1);
    }
}