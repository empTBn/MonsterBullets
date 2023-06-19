/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Commands;

import Utils.CommandUtils;
import java.io.Serializable;

/**
 *
 * @author ejose
 */
public class NameCommand extends BaseCommand implements Serializable{
    
    String name;

    public NameCommand(String commandName, String[] args) {
        super(commandName, args, true);
    }

    
    @Override
    public String executeOnServer() {
        return "Enviado: " + CommandUtils.concatArray(getArgs());
    }

    @Override
    public String executeOnClient() {
        return "Recibido: " + CommandUtils.concatArray(getArgs());
    }
}
