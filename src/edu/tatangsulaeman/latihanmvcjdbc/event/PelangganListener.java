/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.tatangsulaeman.latihanmvcjdbc.event;

import edu.tatangsulaeman.latihanmvcjdbc.entity.Pelanggan;
import edu.tatangsulaeman.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author amtat
 * Nama : Tatang Sulaeman
 * Kelas : IF2
 * NIM :10119068
 */
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
