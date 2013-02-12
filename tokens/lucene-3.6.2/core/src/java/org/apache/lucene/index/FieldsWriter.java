package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
index	TokenNameIdentifier
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
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Document	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
Fieldable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
document	TokenNameIdentifier
.	TokenNameDOT
NumericField	TokenNameIdentifier
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
store	TokenNameIdentifier
.	TokenNameDOT
IndexInput	TokenNameIdentifier
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
IndexOutput	TokenNameIdentifier
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
RAMOutputStream	TokenNameIdentifier
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
final	TokenNamefinal
class	TokenNameclass
FieldsWriter	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_TOKENIZED	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_BINARY	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_COMPRESSED	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
_NUMERIC_BIT_SHIFT	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_NUMERIC_MASK	TokenNameIdentifier
=	TokenNameEQUAL
0x07	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
_NUMERIC_BIT_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_NUMERIC_INT	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
_NUMERIC_BIT_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_NUMERIC_LONG	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
_NUMERIC_BIT_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_NUMERIC_FLOAT	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
_NUMERIC_BIT_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FIELD_IS_NUMERIC_DOUBLE	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
_NUMERIC_BIT_SHIFT	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_VERSION_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_LUCENE_3_0_NO_COMPRESSED_FIELDS	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_LUCENE_3_2_NUMERIC_FIELDS	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
FORMAT_CURRENT	TokenNameIdentifier
=	TokenNameEQUAL
FORMAT_LUCENE_3_2_NUMERIC_FIELDS	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
FieldInfos	TokenNameIdentifier
fieldInfos	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
segment	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
IndexOutput	TokenNameIdentifier
fieldsStream	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
IndexOutput	TokenNameIdentifier
indexStream	TokenNameIdentifier
;	TokenNameSEMICOLON
FieldsWriter	TokenNameIdentifier
(	TokenNameLPAREN
Directory	TokenNameIdentifier
directory	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
segment	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfos	TokenNameIdentifier
fn	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
directory	TokenNameIdentifier
=	TokenNameEQUAL
directory	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
segment	TokenNameIdentifier
=	TokenNameEQUAL
segment	TokenNameIdentifier
;	TokenNameSEMICOLON
fieldInfos	TokenNameIdentifier
=	TokenNameEQUAL
fn	TokenNameIdentifier
;	TokenNameSEMICOLON
boolean	TokenNameboolean
success	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
fieldsStream	TokenNameIdentifier
=	TokenNameEQUAL
directory	TokenNameIdentifier
.	TokenNameDOT
createOutput	TokenNameIdentifier
(	TokenNameLPAREN
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
FIELDS_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexStream	TokenNameIdentifier
=	TokenNameEQUAL
directory	TokenNameIdentifier
.	TokenNameDOT
createOutput	TokenNameIdentifier
(	TokenNameLPAREN
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
FIELDS_INDEX_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
FORMAT_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
indexStream	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
FORMAT_CURRENT	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
success	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
success	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
FieldsWriter	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
fdx	TokenNameIdentifier
,	TokenNameCOMMA
IndexOutput	TokenNameIdentifier
fdt	TokenNameIdentifier
,	TokenNameCOMMA
FieldInfos	TokenNameIdentifier
fn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
directory	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
segment	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
fieldInfos	TokenNameIdentifier
=	TokenNameEQUAL
fn	TokenNameIdentifier
;	TokenNameSEMICOLON
fieldsStream	TokenNameIdentifier
=	TokenNameEQUAL
fdt	TokenNameIdentifier
;	TokenNameSEMICOLON
indexStream	TokenNameIdentifier
=	TokenNameEQUAL
fdx	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setFieldsStream	TokenNameIdentifier
(	TokenNameLPAREN
IndexOutput	TokenNameIdentifier
stream	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
fieldsStream	TokenNameIdentifier
=	TokenNameEQUAL
stream	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
flushDocument	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
numStoredFields	TokenNameIdentifier
,	TokenNameCOMMA
RAMOutputStream	TokenNameIdentifier
buffer	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
indexStream	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
numStoredFields	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buffer	TokenNameIdentifier
.	TokenNameDOT
writeTo	TokenNameIdentifier
(	TokenNameLPAREN
fieldsStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
skipDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
indexStream	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
finish	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
numDocs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
4	TokenNameIntegerLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
long	TokenNamelong
)	TokenNameRPAREN
numDocs	TokenNameIdentifier
)	TokenNameRPAREN
*	TokenNameMULTIPLY
8	TokenNameIntegerLiteral
!=	TokenNameNOT_EQUAL
indexStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
fieldsIdxName	TokenNameIdentifier
=	TokenNameEQUAL
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
FIELDS_INDEX_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"fdx size mismatch: "	TokenNameStringLiteral
+	TokenNamePLUS
numDocs	TokenNameIdentifier
+	TokenNamePLUS
" docs vs "	TokenNameStringLiteral
+	TokenNamePLUS
indexStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" length in bytes of "	TokenNameStringLiteral
+	TokenNamePLUS
fieldsIdxName	TokenNameIdentifier
+	TokenNamePLUS
" file exists?="	TokenNameStringLiteral
+	TokenNamePLUS
directory	TokenNameIdentifier
.	TokenNameDOT
fileExists	TokenNameIdentifier
(	TokenNameLPAREN
fieldsIdxName	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
directory	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
IOUtils	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
fieldsStream	TokenNameIdentifier
,	TokenNameCOMMA
indexStream	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
fieldsStream	TokenNameIdentifier
=	TokenNameEQUAL
indexStream	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
abort	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
directory	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ignored	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
directory	TokenNameIdentifier
.	TokenNameDOT
deleteFile	TokenNameIdentifier
(	TokenNameLPAREN
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
FIELDS_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ignored	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
try	TokenNametry
{	TokenNameLBRACE
directory	TokenNameIdentifier
.	TokenNameDOT
deleteFile	TokenNameIdentifier
(	TokenNameLPAREN
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
segmentFileName	TokenNameIdentifier
(	TokenNameLPAREN
segment	TokenNameIdentifier
,	TokenNameCOMMA
IndexFileNames	TokenNameIdentifier
.	TokenNameDOT
FIELDS_INDEX_EXTENSION	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IOException	TokenNameIdentifier
ignored	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
void	TokenNamevoid
writeField	TokenNameIdentifier
(	TokenNameLPAREN
FieldInfo	TokenNameIdentifier
fi	TokenNameIdentifier
,	TokenNameCOMMA
Fieldable	TokenNameIdentifier
field	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
fi	TokenNameIdentifier
.	TokenNameDOT
number	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
bits	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
isTokenized	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
FIELD_IS_TOKENIZED	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
isBinary	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
FIELD_IS_BINARY	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
instanceof	TokenNameinstanceof
NumericField	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
NumericField	TokenNameIdentifier
)	TokenNameRPAREN
field	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getDataType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
INT	TokenNameIdentifier
:	TokenNameCOLON
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
FIELD_IS_NUMERIC_INT	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
LONG	TokenNameIdentifier
:	TokenNameCOLON
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
FIELD_IS_NUMERIC_LONG	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FLOAT	TokenNameIdentifier
:	TokenNameCOLON
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
FIELD_IS_NUMERIC_FLOAT	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
DOUBLE	TokenNameIdentifier
:	TokenNameCOLON
bits	TokenNameIdentifier
|=	TokenNameOR_EQUAL
FIELD_IS_NUMERIC_DOUBLE	TokenNameIdentifier
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
assert	TokenNameassert
false	TokenNamefalse
:	TokenNameCOLON
"Should never get here"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeByte	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
byte	TokenNamebyte
)	TokenNameRPAREN
bits	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
isBinary	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
byte	TokenNamebyte
[	TokenNameLBRACKET
]	TokenNameRBRACKET
data	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
len	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
data	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
getBinaryValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
len	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
getBinaryLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
offset	TokenNameIdentifier
=	TokenNameEQUAL
field	TokenNameIdentifier
.	TokenNameDOT
getBinaryOffset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeBytes	TokenNameIdentifier
(	TokenNameLPAREN
data	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
instanceof	TokenNameinstanceof
NumericField	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
NumericField	TokenNameIdentifier
nf	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
NumericField	TokenNameIdentifier
)	TokenNameRPAREN
field	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
Number	TokenNameIdentifier
n	TokenNameIdentifier
=	TokenNameEQUAL
nf	TokenNameIdentifier
.	TokenNameDOT
getNumericValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
switch	TokenNameswitch
(	TokenNameLPAREN
nf	TokenNameIdentifier
.	TokenNameDOT
getDataType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
INT	TokenNameIdentifier
:	TokenNameCOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
LONG	TokenNameIdentifier
:	TokenNameCOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
FLOAT	TokenNameIdentifier
:	TokenNameCOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
Float	TokenNameIdentifier
.	TokenNameDOT
floatToIntBits	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
floatValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
DOUBLE	TokenNameIdentifier
:	TokenNameCOLON
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
doubleToLongBits	TokenNameIdentifier
(	TokenNameLPAREN
n	TokenNameIdentifier
.	TokenNameDOT
doubleValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
assert	TokenNameassert
false	TokenNamefalse
:	TokenNameCOLON
"Should never get here"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeString	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
stringValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
final	TokenNamefinal
void	TokenNamevoid
addRawDocuments	TokenNameIdentifier
(	TokenNameLPAREN
IndexInput	TokenNameIdentifier
stream	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
lengths	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
numDocs	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
long	TokenNamelong
position	TokenNameIdentifier
=	TokenNameEQUAL
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
start	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
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
numDocs	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
indexStream	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
position	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
position	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
lengths	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
copyBytes	TokenNameIdentifier
(	TokenNameLPAREN
stream	TokenNameIdentifier
,	TokenNameCOMMA
position	TokenNameIdentifier
-	TokenNameMINUS
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assert	TokenNameassert
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
position	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
void	TokenNamevoid
addDocument	TokenNameIdentifier
(	TokenNameLPAREN
Document	TokenNameIdentifier
doc	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
indexStream	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
getFilePointer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
storedCount	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
List	TokenNameIdentifier
<	TokenNameLESS
Fieldable	TokenNameIdentifier
>	TokenNameGREATER
fields	TokenNameIdentifier
=	TokenNameEQUAL
doc	TokenNameIdentifier
.	TokenNameDOT
getFields	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Fieldable	TokenNameIdentifier
field	TokenNameIdentifier
:	TokenNameCOLON
fields	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
isStored	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
storedCount	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fieldsStream	TokenNameIdentifier
.	TokenNameDOT
writeVInt	TokenNameIdentifier
(	TokenNameLPAREN
storedCount	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Fieldable	TokenNameIdentifier
field	TokenNameIdentifier
:	TokenNameCOLON
fields	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
isStored	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
writeField	TokenNameIdentifier
(	TokenNameLPAREN
fieldInfos	TokenNameIdentifier
.	TokenNameDOT
fieldInfo	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
field	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
