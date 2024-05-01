package day38_inheritance;

public class C02_InheritancedaClassUyeleriniKullanma extends C01_Parent {

    String s = "Ali";
    String t = "Veli";
    int a = 33;
    int b = 34;
    int c = 35;

    public static void main(String[] args) {
        C02_InheritancedaClassUyeleriniKullanma obj = new C02_InheritancedaClassUyeleriniKullanma();
        obj.method1();
    }

    private void method1() {
        String s = "Malatya";
        String k = "Niğde";
        int a = 43;
        int b = 44;
        int c = 45;
        int d = 46;

        System.out.println(a); // 43
        System.out.println(this.a); // 33 class daki a yı yazdırır
        System.out.println(super.a); // 10  parent class daki a yı yazdırır

        System.out.println(b); // 44
        System.out.println(this.b); // 34 class daki b yı yazdırır
        System.out.println(super.b); // 20  parent class daki b yı yazdırır

        System.out.println(c); // 45
        System.out.println(this.c); // 35 class daki c yı yazdırır
       // System.out.println(super.c); // CTE

        System.out.println(d); // 46
      //  System.out.println(this.a);
     //   System.out.println(super.a);

        System.out.println(k); // Niğde
        System.out.println(s);
        System.out.println(t); // veli scope ta olmadığı için class dan aldı
        System.out.println(str); //  scopda ve class da olmadığı için parant dan alır

          /*
            Bir scope'da herhangi bir class uyesini kullanmak istersek
            Java sirasi ile
            1- icinde oldugu scope
            2- icinde oldugu class
            3- parent class(lar)'a bakar ve ilk buldugunu kullanir
         */

        /*
            this.variableIsmi yazdigimizda
            aramaya scope'u atlayip class level'dan baslar
            class seviyesinde veya parent class'larda buldugu ilk degeri kullanir,
            class seviyesinde veya parent class'larda variable'i bulamazsa CTE verir
            (scope'a donmez)

            super.variableIsmi yazdigimizda
            aramaya scope ve icinde oldugu class'i atlayip
            direk parent class'dan baslar
            parent class veya parent class'in parent'larinda buldugu ilk degeri kullanir
            EGER parent class veya parent class'in parent'larinda bulamazsa
            CTE verir,
            class'a veya scope'a donmez
         */
    }
}
