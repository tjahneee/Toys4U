/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Toys4U.Particles;

import Toys4U.Infrastructure.Eatable;
import Toys4U.Particles.Collections.DietCollection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Charles Korthout
 */
public class PlantImpl extends Plant {
    
    double energy;
    /**
     * Set the energy level of the plant
     * @param energy The energy level to set
     */
    @Override
    public void setEngergyLevel(double energy) {
        this.energy = energy;
    }

    /**
     * Get the energy level of this plant
     * @return the energy level of this particle
     */
    @Override
    public double getEnergyLevel() {
        return energy;
    }

    /**
     * Returns the list of eatable particles for this plant. currently the list is empty
     * @return The empty list.
     */
    @Override
    public DietCollection digestion() {
        return new DietCollection();
    }

}
