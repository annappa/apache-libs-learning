package com.kscm;

import java.io.*;
import java.net.URL;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
public class ZipFiles {
    public static void main(String[] args) throws Exception{
        /* Create Output Stream that will have final zip files */
        OutputStream zip_output = new FileOutputStream(new File("zip_output.zip"));
        /* Create Archive Output Stream that attaches File Output Stream / and specifies type of compression */
        ArchiveOutputStream logical_zip = new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, zip_output);
        /* Create Archieve entry - write header information*/
        logical_zip.putArchiveEntry(new ZipArchiveEntry("test_file_1.xml"));
        /* Copy input file */
        ZipFiles zipFiles = new ZipFiles();
        IOUtils.copy(new FileInputStream(zipFiles.getFileFromResources("test_file_1.xml")), logical_zip);
        /* Close Archieve entry, write trailer information */
        logical_zip.closeArchiveEntry();
        /* Repeat steps for file - 2 */
        //System.exit(0);
        logical_zip.putArchiveEntry(new ZipArchiveEntry("test_file_2.xml"));
        IOUtils.copy(new FileInputStream(zipFiles.getFileFromResources("test_file_2.xml")), logical_zip);
        logical_zip.closeArchiveEntry();
        /* Finish addition of entries to the file */
        logical_zip.finish();
        /* Close output stream, our files are zipped */
        zip_output.close();
    }

    private File getFileFromResources(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            return new File(resource.getFile());
        }

    }
}
