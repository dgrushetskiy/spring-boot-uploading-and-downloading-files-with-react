package ru.gothmog.rest.downloadfile.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "file", schema = "dbo")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "file_name")
    private String fileName;
    @Column(name = "content_type")
    private String contentType;

    private byte[] image;

    public FileEntity() {
    }

    public FileEntity(String fileName, String contentType, byte[] image) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.image = image;
    }
}
