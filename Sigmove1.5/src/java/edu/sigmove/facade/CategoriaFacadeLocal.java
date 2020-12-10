/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sigmove.facade;

import edu.sigmove.entity.Categoria;
import edu.sigmove.entity.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Freddy
 */
@Local
public interface CategoriaFacadeLocal {

    void create(Categoria categoria);

    void edit(Categoria categoria);

    void remove(Categoria categoria);

    Categoria find(Object id);

    List<Categoria> findAll();

    List<Categoria> findRange(int[] range);

    int count();

    public List<Producto> listaProdutosporcategoria(int fk_categoria);

    public int catidadProductoCategoria(int fk_produto);
    
}