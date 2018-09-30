package flickr.imagesearch.viewmodel;

import android.app.Activity;
import android.databinding.ObservableInt;
import android.view.View;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import flickr.imagesearch.data.FlickrApiResponse;
import flickr.imagesearch.data.utils.URLBuilder;
import flickr.imagesearch.model.Photo;
import flickr.imagesearch.viewmodel.PhotoViewModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * PhotoViewModel local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PhotoViewModelUnitTest
{
    private PhotoViewModel photoViewModel;

    @Before
    public void setUpViewModel()
    {
        this.photoViewModel = new PhotoViewModel(new Activity(), new ArrayList<Photo>(), new URLBuilder(), new FlickrApiResponse());
    }

    @Test
    public void isNotNull()
    {
        assertNotNull(photoViewModel);
    }


    @Test
    public void getPhotoList()
    {
        assertNotNull(photoViewModel.getPhotoList());
    }

    @Test
    public void onQueryTextSubmit()
    {
        assertEquals(false, photoViewModel.onQueryTextSubmit(""));
    }

    @Test
    public void onQueryTextChange()
    {
        assertEquals(false, photoViewModel.onQueryTextChange(""));
    }
}