package net.minecraft.server;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PathfinderGoalSelector {

    private static final Logger a;

    private final Set<PathfinderGoalSelector.PathfinderGoalSelectorItem> b;

    private final Set<PathfinderGoalSelector.PathfinderGoalSelectorItem> c;

    private final MethodProfiler d;

    private int e;

    private int f;

    private int g;

    public PathfinderGoalSelector(MethodProfiler methodprofiler) {
    }

    public void a(int i, PathfinderGoal pathfindergoal) {
    }

    public void a(PathfinderGoal pathfindergoal) {
    }

    public void a() {
    }

    private boolean a(PathfinderGoalSelector.PathfinderGoalSelectorItem pathfindergoalselector_pathfindergoalselectoritem) {
        return false;
    }

    private boolean b(PathfinderGoalSelector.PathfinderGoalSelectorItem pathfindergoalselector_pathfindergoalselectoritem) {
        return false;
    }

    private boolean a(PathfinderGoalSelector.PathfinderGoalSelectorItem pathfindergoalselector_pathfindergoalselectoritem, PathfinderGoalSelector.PathfinderGoalSelectorItem pathfindergoalselector_pathfindergoalselectoritem1) {
        return false;
    }

    public boolean b(int i) {
        return false;
    }

    public void c(int i) {
    }

    public void d(int i) {
    }

    public void a(int i, boolean flag) {
    }

    class PathfinderGoalSelectorItem {

        public final PathfinderGoal a;

        public final int b;

        public boolean c;

        public PathfinderGoalSelectorItem(int i, PathfinderGoal pathfindergoal) {
        }

        public boolean equals(@Nullable Object object) {
            return false;
        }

        public int hashCode() {
            return 0;
        }
    }
}
