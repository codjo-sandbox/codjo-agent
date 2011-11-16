/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package net.codjo.agent;
/**
 * D�crit un service associ� � un container.
 */
public interface Service {
    /**
     * Retourne le nom du service (unique).
     *
     * @return un nom
     */
    public String getName();


    /**
     * Initialisation du service.
     *
     * @param containerConfiguration
     *
     * @throws ServiceException
     */
    public void boot(ContainerConfiguration containerConfiguration) throws ServiceException;


    /**
     * Retourne le serviceHelper associ� � l'agent pass� en param�tre
     *
     * @param agent
     *
     * @return un serviceHelper
     */
    public ServiceHelper getServiceHelper(Agent agent);
}
