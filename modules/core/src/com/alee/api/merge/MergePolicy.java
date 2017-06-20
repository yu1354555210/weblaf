/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.api.merge;

import java.io.Serializable;

/**
 * Objects merge restriction policy.
 * It is asked whether or not specified objects can be merged.
 *
 * @author Mikle Garin
 * @see <a href="https://github.com/mgarin/weblaf/wiki/How-to-use-Merge">How to use Merge</a>
 * @see Merge
 */

public interface MergePolicy extends Serializable
{
    /**
     * Returns whether or not specified objects can be merged.
     *
     * @param merge  {@link Merge} algorithm
     * @param object base object
     * @param merged object to merge
     * @return {@code true} if specified objects can be merged, {@code false} otherwise
     */
    public boolean accept ( Merge merge, Object object, Object merged );
}