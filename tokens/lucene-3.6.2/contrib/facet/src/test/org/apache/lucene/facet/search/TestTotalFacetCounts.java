package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
search	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
.	TokenNameDOT
Directory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
IOUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
_TestUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LuceneTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
FacetTestUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
FacetTestUtils	TokenNameIdentifier
.	TokenNameDOT
IndexTaxonomyReaderPair	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
FacetTestUtils	TokenNameIdentifier
.	TokenNameDOT
IndexTaxonomyWriterPair	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
facet	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
.	TokenNameDOT
params	TokenNameIdentifier
.	TokenNameDOT
DefaultFacetIndexingParams	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestTotalFacetCounts	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
void	TokenNamevoid
initCache	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
numEntries	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
getSingleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
getSingleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setCacheSize	TokenNameIdentifier
(	TokenNameLPAREN
numEntries	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
doTestWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
14	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
100	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doTestWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
doTestWriteRead	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
int	TokenNameint
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
initCache	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Directory	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
dirs	TokenNameIdentifier
=	TokenNameEQUAL
FacetTestUtils	TokenNameIdentifier
.	TokenNameDOT
createIndexTaxonomyDirs	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexTaxonomyWriterPair	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
writers	TokenNameIdentifier
=	TokenNameEQUAL
FacetTestUtils	TokenNameIdentifier
.	TokenNameDOT
createIndexTaxonomyWriterPair	TokenNameIdentifier
(	TokenNameLPAREN
dirs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DefaultFacetIndexingParams	TokenNameIdentifier
iParams	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultFacetIndexingParams	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
@	TokenNameAT
Override	TokenNameIdentifier
protected	TokenNameprotected
int	TokenNameint
fixedPartitionSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
partitionSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
expectedCounts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
2	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"b"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
"d"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"e"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
,	TokenNameCOMMA
"d"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
"g"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
"z"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
"a"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"1"	TokenNameStringLiteral
,	TokenNameCOMMA
"2"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TestTotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
addFacets	TokenNameIdentifier
(	TokenNameLPAREN
iParams	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexWriter	TokenNameIdentifier
,	TokenNameCOMMA
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxWriter	TokenNameIdentifier
,	TokenNameCOMMA
"b"	TokenNameStringLiteral
,	TokenNameCOMMA
"c"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
commit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
writers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IndexTaxonomyReaderPair	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
readers	TokenNameIdentifier
=	TokenNameEQUAL
FacetTestUtils	TokenNameIdentifier
.	TokenNameDOT
createIndexTaxonomyReaderPair	TokenNameIdentifier
(	TokenNameLPAREN
dirs	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
intArray	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
iParams	TokenNameIdentifier
.	TokenNameDOT
getPartitionSize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
TotalFacetCountsCache	TokenNameIdentifier
tfcc	TokenNameIdentifier
=	TokenNameEQUAL
TotalFacetCountsCache	TokenNameIdentifier
.	TokenNameDOT
getSingleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
File	TokenNameIdentifier
tmpFile	TokenNameIdentifier
=	TokenNameEQUAL
_TestUtil	TokenNameIdentifier
.	TokenNameDOT
createTempFile	TokenNameIdentifier
(	TokenNameLPAREN
"test"	TokenNameStringLiteral
,	TokenNameCOMMA
"tmp"	TokenNameStringLiteral
,	TokenNameCOMMA
TEMP_DIR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tfcc	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
(	TokenNameLPAREN
tmpFile	TokenNameIdentifier
,	TokenNameCOMMA
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxReader	TokenNameIdentifier
,	TokenNameCOMMA
iParams	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tfcc	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tfcc	TokenNameIdentifier
.	TokenNameDOT
load	TokenNameIdentifier
(	TokenNameLPAREN
tmpFile	TokenNameIdentifier
,	TokenNameCOMMA
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxReader	TokenNameIdentifier
,	TokenNameCOMMA
iParams	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TotalFacetCounts	TokenNameIdentifier
totalCounts	TokenNameIdentifier
=	TokenNameEQUAL
tfcc	TokenNameIdentifier
.	TokenNameDOT
getTotalCounts	TokenNameIdentifier
(	TokenNameLPAREN
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
indexReader	TokenNameIdentifier
,	TokenNameCOMMA
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
taxReader	TokenNameIdentifier
,	TokenNameCOMMA
iParams	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
partition	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
expectedCounts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
partitionSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
totalCounts	TokenNameIdentifier
.	TokenNameDOT
fillTotalCountsForPartition	TokenNameIdentifier
(	TokenNameLPAREN
intArray	TokenNameIdentifier
,	TokenNameCOMMA
partition	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
partitionExpectedCounts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
partitionSize	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
nToCopy	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
min	TokenNameIdentifier
(	TokenNameLPAREN
partitionSize	TokenNameIdentifier
,	TokenNameCOMMA
expectedCounts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
expectedCounts	TokenNameIdentifier
,	TokenNameCOMMA
i	TokenNameIdentifier
,	TokenNameCOMMA
partitionExpectedCounts	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
nToCopy	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"Wrong counts! for partition "	TokenNameStringLiteral
+	TokenNamePLUS
partition	TokenNameIdentifier
+	TokenNamePLUS
" Expected: "	TokenNameStringLiteral
+	TokenNamePLUS
Arrays	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
partitionExpectedCounts	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" Actual: "	TokenNameStringLiteral
+	TokenNamePLUS
Arrays	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
intArray	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
Arrays	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
partitionExpectedCounts	TokenNameIdentifier
,	TokenNameCOMMA
intArray	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
partition	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
readers	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IOUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
dirs	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tmpFile	TokenNameIdentifier
.	TokenNameDOT
delete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE