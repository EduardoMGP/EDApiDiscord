/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edapidiscord;


import org.bukkit.plugin.java.JavaPlugin;

public class EDApiDiscord extends JavaPlugin{

    @Override
    public void onEnable() {
        System.out.println("[EDApi] Habilitado com sucesso");
    }
    
    @Override
    public void onDisable() {
        System.out.println("[EDApi] disabilitado com sucesso");
    }
    
    
}
