/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialservidor;

/**
 *
 * @author ruben
 */
public class Factorialservidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int numero) {
        pack.NewWebService_Service service = new pack.NewWebService_Service();
        pack.NewWebService port = service.getNewWebServicePort();
        return port.factorial(numero);
    }
    
}
