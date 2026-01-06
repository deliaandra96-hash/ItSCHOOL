package Session9;

public class Bancomat {
    static void main(String[] args) {

        ContBancar contBncar1 = new ContBancar("Marcel" , 1000) ;
        contBncar1.depunere(100);
        contBncar1.depunere(-100);
        contBncar1.getDetails() ;
        contBncar1.retragere(50);
        contBncar1.retragere(-20);
        contBncar1.getDetails();


        ContBancar.setDobanda(0.09);
        contBncar1.getDetails() ;
    }
}
