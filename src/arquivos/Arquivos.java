package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JOptionPane;


public class Arquivos {
 public static void main(String[] args) {
         try {
           gravar();
            ler();
        } catch (Exception e) {
             System.out.println("Ocorreu erro ao fechar!");
        }
    }    
        
    private static void gravar() throws IOException{
 
        //Passo 1: quem é o arquivo? onde ele está?
        String arquivo = "D:\\Eclipse.java\\Project-Java\\Banco-de-Dados-passo-a-passo\\BancoDeDados.txt";
        
        //Passo 2: criar um objeto Path(caminho)
        Path path = Paths.get(arquivo);
        
        
        BufferedWriter bw = null;
        
        //Passo 3: Criar um escritor(gravar no arquivo)
        try {
            bw = Files.newBufferedWriter( //serve para gravar um arquivo
                path,
                StandardOpenOption.APPEND, //
                StandardOpenOption.WRITE);
            
        //Passo 4: Passar o conteúdo que será escrito no arquivo
        bw.write("Olá eu sou o Gustavo");
        bw.newLine(); // criar uma linha em branco no arquivo, ele funciona como o \n
        
        
        
        } catch (IOException ex) { // catch trata o erro
            JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado!");
        } finally{      
            //Passo 5: Fechar o arquivo
            if (bw != null){
                bw.close();
            }
        }
    }
    public static void ler(){
        //Passo 1: quem é o arquivo? onde ele está?
        String arquivo = "D:\\Eclipse.java\\Project-Java\\Banco-de-Dados-passo-a-passo\\BancoDeDados.txt";
        
        //Passo 2: criar um objeto Path(caminho)
        Path path = Paths.get(arquivo);
        
        //criar um leitor
        try {
            BufferedReader br = Files.newBufferedReader(path);
            
            String linha = br.readLine(); //lê uma linha do arquivo que será aberto
            
            while (linha != null){
                String[] linhaVetor = linha.split(";");
                System.out.println(linhaVetor[0]);
                linha = br.readLine();
            }
           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }    
}
    


