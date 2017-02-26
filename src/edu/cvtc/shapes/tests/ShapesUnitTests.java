package edu.cvtc.shapes.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.MessageBox;
import edu.cvtc.shapes.Sphere;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

/**
 * @author gcedarblade
 *
 */
@RunWith(JUnitParamsRunner.class)
public class ShapesUnitTests {

	@Test
	public void getCuboidWidth(){
		Cuboid cube = new Cuboid(2, 2, 2, new MessageBox());
		
		int expected = 2;
		int actual = (int) cube.getWidth();
		assertEquals(expected, actual);
	}
	
	@Test
	public void getCuboidHeight(){
		Cuboid cube = new Cuboid(2, 2, 2, new MessageBox());
		
		int expected = 2;
		int actual = (int) cube.getHeight();
		assertEquals(expected, actual);
	}
	
	@Test
	public void getCuboidDepth(){
		Cuboid cube = new Cuboid(2, 2, 2, new MessageBox());
		
		int expected = 2;
		int actual = (int) cube.getDepth();
		assertEquals(expected, actual);
	}
	
	@Test
	@Parameters({
		"2, 2, 3",
		"3, 3, 2",
		"4, 3, 4"
	})
	public void getCuboidSurfaceArea(float width, float height, float depth) throws IllegalArgumentException {
		if(width < 0|| height < 0 || depth < 0){
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Cuboid cube = new Cuboid(width, height, depth, new MessageBox());
			int expected = (int) ((cube.getWidth() * cube.getDepth() + cube.getHeight() * cube.getDepth() + cube.getHeight() * cube.getWidth()) * 2.0f);
			int actual = (int) cube.surfaceArea();
			assertEquals(expected, actual);
		}
	}
	
	@Test
	@Parameters({
		"2, 2, 3",
		"3, 3, 2",
		"4, 3, 4"
	})
	public void getCuboidVolume(float width, float height, float depth) throws IllegalArgumentException {
		if (width < 0 || height < 0 || depth < 0) {
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Cuboid cube = new Cuboid(width, height, depth, new MessageBox());
			int expected = (int) (cube.getWidth() * cube.getDepth() * cube.getHeight());
			int actual = (int) cube.volume();
			assertEquals(expected, actual);
		}
	}
	
	/**Cylinder**/
	
	@Test
	public void getCylinderHeight(){
		Cylinder cylinder = new Cylinder(3.0f, 3.0f, new MessageBox());
		
		float expected = 3.0f;
		float actual = cylinder.getHeight();
		assertEquals(expected, actual, 0.0001f);
	}
	
	@Test
	public void getCylinderRadius(){
		Cylinder cylinder = new Cylinder(3, 3, new MessageBox());
		
		int expected = 3;
		int actual = (int) cylinder.getRadius();
		assertEquals(expected, actual);
	}
	
	@Test
	@Parameters({
		"2, 2",
		"3, 3",
		"4, 3"
	})
	public void getCylinderSurfaceArea(float radius, float height) throws IllegalArgumentException {
		if (radius < 0 || height < 0) {
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Cylinder cylinder = new Cylinder(radius, height, new MessageBox());
			int expected = (int) (2.0f * (float)Math.PI * cylinder.getRadius() * cylinder.getHeight() + 2.0f * (float)Math.PI * (cylinder.getRadius() * cylinder.getRadius()));
			int actual = (int) cylinder.surfaceArea();
			assertEquals(expected, actual);
		}
	}
	
	@Test
	@Parameters({
		"2, 2",
		"3, 3",
		"4, 3"
	})
	public void getCylinderVolume(float radius, float height) throws IllegalArgumentException {
		if (radius < 0 || height < 0) {
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Cylinder cylinder = new Cylinder(radius, height, new MessageBox());
			int expected = (int) ((cylinder.getRadius() * cylinder.getRadius()) * (float)Math.PI * cylinder.getHeight());
			int actual = (int) cylinder.volume();
			assertEquals(expected, actual);
		}
	}
	
	/**Sphere**/
	
	@Test
	public void getSphereRadius(){
		Sphere sphere = new Sphere(5, new MessageBox());
		int expected = 5;
		int actual = (int) sphere.getRadius();
		assertEquals(expected, actual);
	}
	
	@Test
	@Parameters({
		"2",
		"3",
		"4"
	})
	public void getSphereSurfaceArea(float radius) throws IllegalArgumentException {
		if (radius < 0) {
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Sphere sphere = new Sphere(radius, new MessageBox());
			int expected = (int) (4.0f * (float)Math.PI * radius * radius);
			int actual = (int) sphere.surfaceArea();
			assertEquals(expected, actual);
		}
	}
	
	@Test
	@Parameters({
		"2",
		"3",
		"4"
	})
	public void getSphereVolume(float radius) throws IllegalArgumentException {
		if (radius < 0) {
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Sphere sphere = new Sphere(radius, new MessageBox());
			int expected = (int) (4.0f / 3.0f * (float)Math.PI * (radius * radius * radius));
			int actual = (int) sphere.volume();
			assertEquals(expected, actual);
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters({
		"-2",
		"-3",
		"-4"
	})
	public int getSphereVolumeWithNegativeValues(float radius) throws IllegalArgumentException {
		if (radius < 0) {
			throw new IllegalArgumentException("Cannot have negative input");
		} else {
			Sphere sphere = new Sphere(radius, new MessageBox());
			return (int) sphere.volume();
		}
	}
}
