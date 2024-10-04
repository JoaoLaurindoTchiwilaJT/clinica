package clinica;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class controller {
    
    //HBox sendo usados como botões
    @FXML 
    private HBox statusView ;

    @FXML 
    private HBox cadastrar_paciente;

    @FXML 
    private HBox cadastrar_medicamentos;

    @FXML 
    private HBox cadastrar_medicos;

    @FXML 
    private HBox viewHistorico;

    //Paineis

    @FXML 
    private Pane status;

    @FXML 
    private Pane pacientes;

    @FXML 
    private Pane medicos;

    @FXML 
    private Pane medicamentos;

    @FXML 
    private Pane historico;

    @FXML 
    private ImageView imgPaciente;

    @FXML
    private Label labelPaciente;

    @FXML 
    private void ViewStatus(){

    }

    @FXML 
    private void CadastrarMedicamentos(){

    }
    
    @FXML 
    private void CadastrarMedicos(){
        
    }

    @FXML 
    private void CadastrarPacientes(){

        // Carregando a imagem do caminho correto
        Image image = new Image(getClass().getResourceAsStream("/icons/png/verdes/user-4-fill.png"));
                
        // Troca a imagem no ImageView
        imgPaciente.setImage(image); 
       
        // Trocar as cores do Label
        labelPaciente.setStyle("-fx-text-fill: #39D98E;");

        // Trocar a cor dos botões
        cadastrar_paciente.setStyle("-fx-background-color: white;");

        // Mudar visibilidade dos paineis
        pacientes.setVisible(true); // Torna o painel visível

    }

    
    @FXML 
    private void viewHistoricos(){
        
    }

    /*
    //Para animações
    private void trocarImage(String url){
        Image image = new Image(getClass().getResourceAsStream(url));
        imageView.setImage(image);
    }*/

}
