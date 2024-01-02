package app;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double rendaAnual = sc.nextDouble();
        System.out.print("Renda anual com prestação de serviços: ");
        double prestacaoServico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double ganhoCapital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = sc.nextDouble();
        System.out.println();

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        double rendaMensalSalario = rendaAnual / 12.0;
        double impostoSalario;
        if (rendaMensalSalario > 3000.0 && rendaMensalSalario <= 5000.0) {
            impostoSalario = rendaAnual * 0.1;
        } else if (rendaMensalSalario > 5000.0) {
            impostoSalario = rendaAnual * 0.2;
        } else {
            impostoSalario = 0;
        }

        double impostoServico = prestacaoServico * 0.15;
        double impostoCapital = ganhoCapital * 0.20;
        double impostoBruto = impostoSalario + impostoServico + impostoCapital;
        double gastosTotais = gastosMedicos + gastosEducacionais;
        double maxDedutivel = impostoBruto * 0.30;
        double gastosDedutiveis = gastosTotais;
        double abatimento = (gastosDedutiveis < maxDedutivel) ? gastosDedutiveis : maxDedutivel;


        double impostoDevido = impostoBruto - abatimento;

        System.out.println();

        System.out.println("CONSOLIDADO DE RENDA");
        System.out.println("Imposto sobre salário: " + impostoSalario);
        System.out.println("Imposto sobre prestação de serviços: " + impostoServico);
        System.out.println("Imposto sobre ganho de capital: " + impostoCapital);

        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.println("Máximo dedutível: " + maxDedutivel);
        System.out.println("Gastos dedutíveis: " + gastosDedutiveis);

        System.out.println();
        System.out.println("RESUMO:");
        System.out.println("Imposto bruto total: " + impostoBruto);
        System.out.println("Abatimento: " + abatimento);
        System.out.println("Imposto devido: " + impostoDevido);

        sc.close();
    }
}






