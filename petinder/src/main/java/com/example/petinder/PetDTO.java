package com.example.petinder;

public class PetDTO {

    private Long id;
    private String name;
    private String kind;
    private String profileText;

    public PetDTO(Long id, String name, String kind, String profileText) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.profileText = profileText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getProfileText() {
        return profileText;
    }

    public void setProfileText(String profileText) {
        this.profileText = profileText;
    }
}
