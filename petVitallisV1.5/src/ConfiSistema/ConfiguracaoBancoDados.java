package ConfiSistema;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiguracaoBancoDados {

    private Properties propriedades;
    private final String arquivoConfiguracao = "ConfiSistema/config.properties";

    public ConfiguracaoBancoDados() {
        propriedades = new Properties();
        carregarConfiguracoes();
    }

    private void carregarConfiguracoes() {
        try (FileInputStream arquivoInput = new FileInputStream(arquivoConfiguracao)) {
            propriedades.load(arquivoInput);
        } catch (IOException ex) {
            ex.printStackTrace(); // Trate a exceção apropriadamente para seu caso
        }
    }

    public String getServidor() {
        return propriedades.getProperty("servidor", "");
    }

    public String getUsuario() {
        return propriedades.getProperty("usuario", "");
    }

    public String getSenha() {
        return propriedades.getProperty("senha", "");
    }

    public void salvarConfiguracoes(String servidor, String usuario, String senha) {
        propriedades.setProperty("servidor", servidor);
        propriedades.setProperty("usuario", usuario);
        propriedades.setProperty("senha", senha);

        try (FileOutputStream arquivoOutput = new FileOutputStream(arquivoConfiguracao)) {
            propriedades.store(arquivoOutput, null);
        } catch (IOException ex) {
            ex.printStackTrace(); // Trate a exceção apropriadamente para seu caso
        }
    }
}
