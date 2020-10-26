package com.qaqtutu.ofdbox.core.xmlobj.base.page.object;

import com.qaqtutu.ofdbox.core.xmlobj.object.text.CT_Text;
import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class NTextObject extends CT_Text implements NObject {
}
