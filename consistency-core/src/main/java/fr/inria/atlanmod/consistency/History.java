/*
 *
 *  * Copyright (c) 2013-2017 Atlanmod INRIA LINA Mines Nantes.
 *  * All rights reserved. This program and the accompanying materials
 *  * are made available under the terms of the Eclipse Public License v1.0
 *  * which accompanies this distribution, and is available at
 *  * http://www.eclipse.org/legal/epl-v10.html
 *  *
 *  * Contributors:
 *  *     Atlanmod INRIA LINA Mines Nantes - initial API and implementation
 *
 *
 */

package fr.inria.atlanmod.consistency;

import fr.inria.atlanmod.consistency.core.FeatureId;
import fr.inria.atlanmod.consistency.update.Operation;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created on 15/03/2017.
 *
 * @author AtlanMod team.
 */
public class History {
    private BlockingQueue<Operation> incoming = new LinkedBlockingQueue<Operation>();
    private Map<FeatureId, List<UpdateMessage>> changes;
    private final SharedResource resource;

    public History(SharedResource resource) {
        this.resource = resource;
    }

    public void integrate(Operation operation) {

    }

    public void add(Operation operation) {
        incoming.offer(operation);
        System.out.println("New operation: " + operation);
    }
}
