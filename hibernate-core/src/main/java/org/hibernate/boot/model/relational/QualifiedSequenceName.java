/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.boot.model.relational;

import org.hibernate.boot.model.naming.Identifier;

/**
 * @author Steve Ebersole
 */
public class QualifiedSequenceName extends QualifiedNameImpl {
	public QualifiedSequenceName(Identifier catalogName, Identifier schemaName, Identifier sequenceName) {
		super( catalogName, schemaName, sequenceName );
	}

	public QualifiedSequenceName(Schema.Name schemaName, Identifier sequenceName) {
		super( schemaName, sequenceName );
	}

	public Identifier getSequenceName() {
		return getObjectName();
	}
}
