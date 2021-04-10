package recursos;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.net.URL;

public class Conexion {

    static Logger log = Logger.getLogger(Conexion.class);
    URL url = Conexion.class.getResource("Log4j.properties");


    public void conectar(String clase){
        PropertyConfigurator.configure(url);
        if(!clase.isEmpty()){
            //Conexion exitosa
            log.info(clase+" sucedio");
        }else{
            //Warning
            log.warn("No hubo clase");
        }
    }
}
