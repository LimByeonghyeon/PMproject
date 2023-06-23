package pm.spring.doc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DocDTO {
	private int doc_no;
    private int fk_writer_empno;
    private String doc_subject;
    private String doc_contents;
    private String writeday;
    private String modificationday;
    private String icon;
    private String fileName;
    private String orgFilename;
    private String fileSize;
    private String D_day;
    private String deptno;
    private String name;
    private String contents;
    private byte[] fileContent; // New field to represent the file content
    private String attachedfile;
    private int readcount;
    private String email;
}