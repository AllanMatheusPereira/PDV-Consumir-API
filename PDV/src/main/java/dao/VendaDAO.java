/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Venda;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author allan
 */
public class VendaDAO extends GenericDAO<Venda>{

    @Override
    protected Venda construirObjeto(ResultSet rs) {
        Venda venda = null;
        
        try {
            venda = new Venda();
            venda.setNumeroPedido(rs.getInt("NUMERO_PEDIDO"));
            venda.setNomeCliente(rs.getString("NOME_CLIENTE"));
            venda.setTelefoneCliente(rs.getString("TELEFONE_CLIENTE"));
            venda.setEmailCliente(rs.getString("EMAIL_CLIENTE"));
            venda.setDescricaoProduto(rs.getString("DESCRICAO_PRODUTO"));
            venda.setValorProduto(rs.getDouble("VALOR_PRODUTO"));
            venda.setCategoriaProduto(rs.getString("CATEGORIA_PRODUTO"));
            venda.setQuantidadeProduto(rs.getInt("QUANTIDADE_PRODUTO"));
            venda.setValorTotalVenda(rs.getDouble("VALOR_TOTAL_VENDA"));
            venda.setObservacoesVenda(rs.getString("OBSERVACOES_VENDA"));
        } catch (SQLException ex) {
            Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venda;    
    }

    @Override
    public boolean salvar(Venda obj) {
    String sql = "INSERT INTO public.\"Venda\"("
            + "\"NUMERO_PEDIDO\", \"NOME_CLIENTE\", \"TELEFONE_CLIENTE\", \"EMAIL_CLIENTE\", "
            + "\"DESCRICAO_PRODUTO\", \"VALOR_PRODUTO\", \"CATEGORIA_PRODUTO\", \"QUANTIDADE_PRODUTO\", "
            + "\"VALOR_TOTAL_VENDA\", \"OBSERVACOES_VENDA\")"
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

    PreparedStatement ps = null;

    try {
        ps = conn.prepareStatement(sql);
        ps.setInt(1, obj.getNumeroPedido());
        ps.setString(2, obj.getNomeCliente());
        ps.setString(3, obj.getTelefoneCliente());
        ps.setString(4, obj.getEmailCliente());
        ps.setString(5, obj.getDescricaoProduto());
        ps.setDouble(6, obj.getValorProduto());
        ps.setString(7, obj.getCategoriaProduto());
        ps.setInt(8, obj.getQuantidadeProduto());
        ps.setDouble(9, obj.getValorTotalVenda());
        ps.setString(10, obj.getObservacoesVenda());
        ps.executeUpdate();
        ps.close();

        return true;
    } catch (SQLException ex) {
        Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
    }

    return false;
}     

    @Override
    public boolean atualizar(Venda obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
