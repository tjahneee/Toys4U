/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toys4U.Infrastructure;

/**
 *
 * @author Charles Korthout
 */
public interface AggregationHandler {
    public long count();
    public double average();
    public double sum();    
}
