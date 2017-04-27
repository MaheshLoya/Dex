package com.dexvis.dex.task.vis.dexjs

import org.simpleframework.xml.Root

import com.dexvis.dex.task.base.WebTask
import com.dexvis.javafx.scene.control.DexTaskProperty
import com.dexvis.util.TaskPropertyFactory

@Root
class ParallelCoordinatesMultiples extends WebTask {
  public ParallelCoordinatesMultiples() {
    super("Visualization: Dex JS", "Parallel Coordinates Multiples",
    "visualization/dexjs/multiples/ParallelCoordinatesMultiples.html",
    "web/dexjs/multiples/ParallelCoordinatesMultiples.gtmpl")

    setSaveDynamic(true)
  }
}
