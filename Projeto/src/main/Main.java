package main;
/**
 * Importacoes dos controladores.
 */
import controller.ControllerLoginGUI;
import controller.ControllerInstituicaoGUI;

/**
 * Classe main.
 */
public class Main {
    public static void main(String[] args) {
        /** 
         * Instancia o controlador, que inicializa a interface e conecta os componentes.
         */
        new ControllerLoginGUI();
    }
}

