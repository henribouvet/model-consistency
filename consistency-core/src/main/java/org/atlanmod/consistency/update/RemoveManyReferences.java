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

package org.atlanmod.consistency.update;

import org.atlanmod.consistency.core.FeatureId;
import org.atlanmod.consistency.core.Id;

import java.util.List;

/**
 * Created on 10/03/2017.
 *
 * @author AtlanMod team.
 */
public class RemoveManyReferences extends BaseOperation {
    private final FeatureId fid;
    private final List<Id> oids;

    public RemoveManyReferences(FeatureId fid, List<Id> oids) {
        this.fid = fid;
        this.oids = oids;
    }

    @Override
    public String toString() {
        return "RemoveManyReferences{" +
                "fid=" + fid +
                ", value=" + oids +
                '}';
    }

    @Override
    public Id instanceId() {
        return fid.asInstanceId();
    }
}
