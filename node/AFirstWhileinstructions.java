/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AFirstWhileinstructions extends PWhileinstructions
{
    private POperation _operation_;

    public AFirstWhileinstructions()
    {
        // Constructor
    }

    public AFirstWhileinstructions(
        @SuppressWarnings("hiding") POperation _operation_)
    {
        // Constructor
        setOperation(_operation_);

    }

    @Override
    public Object clone()
    {
        return new AFirstWhileinstructions(
            cloneNode(this._operation_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFirstWhileinstructions(this);
    }

    public POperation getOperation()
    {
        return this._operation_;
    }

    public void setOperation(POperation node)
    {
        if(this._operation_ != null)
        {
            this._operation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operation_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operation_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operation_ == child)
        {
            this._operation_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operation_ == oldChild)
        {
            setOperation((POperation) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
