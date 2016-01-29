package co.touchlab.researchstack.core.ui.step.body;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.touchlab.researchstack.core.result.StepResult;

public interface StepBody
{
    int VIEW_TYPE_DEFAULT = 0;

    int VIEW_TYPE_COMPACT = 1;

    View getBodyView(int viewType, LayoutInflater inflater, ViewGroup parent);

    StepResult getStepResult();

    boolean isAnswerValid();

}
