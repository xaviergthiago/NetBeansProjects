package thiago_xavier.parte2;

import java.util.Scanner;

public class AppSalarioTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalarioTotal st = new SalarioTotal();
        System.out.println("Digite o número do vendedor: ");
        st.setVendedor(sc.nextLine());
        System.out.println("Digite o salário do vendedor: ");
        st.setSalario(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o total das vendas: ");
        st.setTotalVendas(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o percentual ganho sobre o total de vendas ");
        st.setPercentual(Double.parseDouble(sc.nextLine()));
        System.out.println("O número do vendedor é: " + st.getVendedor());
        System.out.println("O salário total do vendedor é " + (st.getSalario() + (float) (st.getTotalVendas() * st.getPercentual() / 10)));
    }

}
