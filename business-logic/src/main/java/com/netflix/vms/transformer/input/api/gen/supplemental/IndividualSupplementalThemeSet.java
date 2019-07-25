package com.netflix.vms.transformer.input.api.gen.supplemental;

import com.netflix.hollow.api.objects.HollowSet;
import com.netflix.hollow.api.objects.delegate.HollowSetDelegate;
import com.netflix.hollow.api.objects.generic.GenericHollowRecordHelper;

@SuppressWarnings("all")
public class IndividualSupplementalThemeSet extends HollowSet<HString> {

    public IndividualSupplementalThemeSet(HollowSetDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    @Override
    public HString instantiateElement(int ordinal) {
        return (HString) api().getHString(ordinal);
    }

    @Override
    public boolean equalsElement(int elementOrdinal, Object testObject) {
        return GenericHollowRecordHelper.equalObject(getSchema().getElementType(), elementOrdinal, testObject);
    }

    public SupplementalAPI api() {
        return typeApi().getAPI();
    }

    public IndividualSupplementalThemeSetTypeAPI typeApi() {
        return (IndividualSupplementalThemeSetTypeAPI) delegate.getTypeAPI();
    }

}