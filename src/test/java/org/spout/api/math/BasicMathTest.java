/*
 * This file is part of SpoutAPI (http://www.spout.org/).
 *
 * SpoutAPI is licensed under the SpoutDev License Version 1.
 *
 * SpoutAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.api.math;

import static org.junit.Assert.assertEquals;
import static org.spout.api.math.MathHelper.*;
import static org.spout.api.math.TestUtils.eps;

import org.junit.Test;

public class BasicMathTest {
	@Test
	public void testMean() {
		int[] intTestValues = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int intTestResult = 8;
		double[] doubleTestValues = new double[intTestValues.length];
		double doubleTestResult = intTestResult + 0.03;//Some arbitrary value, doesn't matter!

		for(int i = 0; i < intTestValues.length; i++){
			doubleTestValues[i] = intTestValues[i] + 0.03;
		}

		assertEquals(intTestResult, mean(intTestValues));
		assertEquals(doubleTestResult, mean(doubleTestValues), eps);
	}
}