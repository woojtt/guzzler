package pl.woojtt.guzzler.ui.startpage;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import pl.woojtt.guzzler.ui.MainLayout;

//TODO: REMOVE IN FEATURE
@Route(value = "", layout = MainLayout.class)
@PageTitle("Start Page")
public class StartPage extends VerticalLayout {

    public StartPage() {
        addClassName("list-view");
        setSizeFull();
    }
}
