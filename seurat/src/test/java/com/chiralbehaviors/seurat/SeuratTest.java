package com.chiralbehaviors.seurat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.chiralbehaviors.seurat.engine.SeuratEngine;
import com.chiralbehaviors.seurat.product.Particle;

public class SeuratTest {

    @Test
    public void testParticleUpdates() {
        Particle p = mock(Particle.class);
        int xinit = 1, yinit = 1;
        when(p.getXPosition()).thenReturn(xinit);
        when(p.getYPosition()).thenReturn(yinit);
        when(p.getXVelocity()).thenReturn(2);
        when(p.getYVelocity()).thenReturn(3);

        SeuratEngine se = mock(SeuratEngine.class);

        se.step();
        when(p.getXPosition()).thenReturn(3);
        when(p.getYPosition()).thenReturn(4);

        assertEquals(xinit + p.getXVelocity(), p.getXPosition().intValue());
        assertEquals(yinit + p.getYVelocity(), p.getYPosition().intValue());
    }

}
