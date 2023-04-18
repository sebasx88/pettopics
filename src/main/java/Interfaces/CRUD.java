/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Modelo.animales;
import java.util.List;

/**
 *
 * @author dadim
 */
public interface CRUD {
    public List listar();
    public animales list(int id);
    
}
