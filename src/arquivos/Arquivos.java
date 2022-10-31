package arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Arquivos {

    
    public static void main(String[] args) {
        
        //Primeira barra do lado esquerdo anula o caractere seguinte
        //String teste = "Olá \"Pedro\" ";
        
        //Passo 1 - Quem é o arquivo,Onde ele está
        //Endereço
        String arquivo = "C:\\Users\\22282186\\JavaBancoDeDados\\teste.txt";
        
        //Passo 2 - Criar um objeto Path "Caminho"
        Path path = Paths.get(arquivo);
        
        try {
            //Passo 3 - Criar um escritor, Path me fala quem é o arquivo, Append faz aparecer, Write escrevo no arquivo
            BufferedWriter bw = Files.newBufferedWriter(
                    path,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            //Passo 4 - Passar o conteudo que será escrito
            bw.write("Olá, eu sou o Gustavo");
            bw.newLine();
            
            //passo 5 - Fechar o arquivo
            bw.close();
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado!");
        }
        
    }
    
}
