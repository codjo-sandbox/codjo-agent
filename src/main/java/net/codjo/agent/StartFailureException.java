/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package net.codjo.agent;
/**
 * Exception lanc�e lorsqu'un container ne peut pas d�marrer.
 *
 * @see AgentContainer
 * @see AgentContainer#start()
 */
public class StartFailureException extends ContainerFailureException {
    public StartFailureException() {
    }


    public StartFailureException(Throwable cause) {
        super(cause);
    }


    public StartFailureException(String cause) {
        super(cause);
    }
}
