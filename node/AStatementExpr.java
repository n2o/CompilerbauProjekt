/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AStatementExpr extends PExpr
{
    private final LinkedList<PExpr> _expr_ = new LinkedList<PExpr>();

    public AStatementExpr()
    {
        // Constructor
    }

    public AStatementExpr(
        @SuppressWarnings("hiding") List<?> _expr_)
    {
        // Constructor
        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new AStatementExpr(
            cloneList(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatementExpr(this);
    }

    public LinkedList<PExpr> getExpr()
    {
        return this._expr_;
    }

    public void setExpr(List<?> list)
    {
        for(PExpr e : this._expr_)
        {
            e.parent(null);
        }
        this._expr_.clear();

        for(Object obj_e : list)
        {
            PExpr e = (PExpr) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._expr_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expr_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PExpr> i = this._expr_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PExpr) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
